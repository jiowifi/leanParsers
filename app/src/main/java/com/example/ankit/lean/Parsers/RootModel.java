import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String description;
	public String state;
	public String timezone;
	public String name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String type;
	public int id;
	public String organizer_name;
	public String logo;
	public String email;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String location_name;
	public VersionModel _version;
	public String start_time;
	public CopyrightModel _copyright;
	public String topic;
	public String code_of_conduct;
	public String organizer_description;

	public RootModel(String schedule_published_on, String description, String state, String timezone, String name, CreatorModel creator, Call_for_papersModel call_for_papers, String privacy, String type, int id, String organizer_name, String logo, String email, String background_image, ArrayList<Social_linksModel> social_links, String end_time, String location_name, VersionModel version, String start_time, CopyrightModel copyright, String topic, String code_of_conduct, String organizer_description) {

		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.state = state;
		this.timezone = timezone;
		this.name = name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.type = type;
		this.id = id;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.email = email;
		this.background_image = background_image;
		this.social_links = social_links;
		this.end_time = end_time;
		this.location_name = location_name;
		this._version = version;
		this.start_time = start_time;
		this._copyright = copyright;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;

	}

}