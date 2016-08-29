import java.util.ArrayList;

class RootModel {

	public String email;
	public String description;
	public String topic;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String state;
	public String privacy;
	public String location_name;
	public int id;
	public String type;
	public String end_time;
	public String name;
	public String start_time;
	public String schedule_published_on;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String timezone;
	public VersionModel _version;
	public String background_image;
	public String organizer_description;

	public RootModel(String email, String description, String topic, String logo, Call_for_papersModel call_for_papers, String code_of_conduct, ArrayList<Social_linksModel> social_links, String organizer_name, String state, String privacy, String location_name, int id, String type, String end_time, String name, String start_time, String schedule_published_on, CreatorModel creator, CopyrightModel copyright, String timezone, VersionModel version, String background_image, String organizer_description) {

		this.email = email;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.state = state;
		this.privacy = privacy;
		this.location_name = location_name;
		this.id = id;
		this.type = type;
		this.end_time = end_time;
		this.name = name;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._copyright = copyright;
		this.timezone = timezone;
		this._version = version;
		this.background_image = background_image;
		this.organizer_description = organizer_description;

	}

}