import java.util.ArrayList;

class RootModel {

	public String name;
	public VersionModel _version;
	public String start_time;
	public String background_image;
	public String code_of_conduct;
	public String description;
	public CopyrightModel _copyright;
	public String email;
	public String state;
	public String timezone;
	public int id;
	public String type;
	public String privacy;
	public String schedule_published_on;
	public String topic;
	public String end_time;
	public String logo;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;

	public RootModel(String name, VersionModel version, String start_time, String background_image, String code_of_conduct, String description, CopyrightModel copyright, String email, String state, String timezone, int id, String type, String privacy, String schedule_published_on, String topic, String end_time, String logo, CreatorModel creator, ArrayList<Social_linksModel> social_links, String organizer_description, String location_name, Call_for_papersModel call_for_papers, String organizer_name) {

		this.name = name;
		this._version = version;
		this.start_time = start_time;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._copyright = copyright;
		this.email = email;
		this.state = state;
		this.timezone = timezone;
		this.id = id;
		this.type = type;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.end_time = end_time;
		this.logo = logo;
		this._creator = creator;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;

	}

}