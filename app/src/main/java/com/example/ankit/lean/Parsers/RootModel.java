import java.util.ArrayList;

class RootModel {

	public String email;
	public String name;
	public VersionModel _version;
	public String start_time;
	public String end_time;
	public String topic;
	public String description;
	public CreatorModel _creator;
	public int id;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String logo;
	public String state;
	public String code_of_conduct;
	public String schedule_published_on;
	public String timezone;
	public String privacy;
	public String background_image;
	public String type;
	public String organizer_name;
	public String organizer_description;

	public RootModel(String email, String name, VersionModel version, String start_time, String end_time, String topic, String description, CreatorModel creator, int id, CopyrightModel copyright, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String location_name, String logo, String state, String code_of_conduct, String schedule_published_on, String timezone, String privacy, String background_image, String type, String organizer_name, String organizer_description) {

		this.email = email;
		this.name = name;
		this._version = version;
		this.start_time = start_time;
		this.end_time = end_time;
		this.topic = topic;
		this.description = description;
		this._creator = creator;
		this.id = id;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.location_name = location_name;
		this.logo = logo;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.privacy = privacy;
		this.background_image = background_image;
		this.type = type;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;

	}

}