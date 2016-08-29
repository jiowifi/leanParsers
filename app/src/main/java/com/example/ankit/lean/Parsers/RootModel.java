import java.util.ArrayList;

class RootModel {

	public String email;
	public String type;
	public String organizer_name;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String state;
	public String background_image;
	public String code_of_conduct;
	public int id;
	public String logo;
	public String schedule_published_on;
	public String privacy;
	public String name;
	public CreatorModel _creator;
	public VersionModel _version;
	public String topic;
	public String timezone;
	public String start_time;
	public String end_time;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;

	public RootModel(String email, String type, String organizer_name, CopyrightModel copyright, Call_for_papersModel call_for_papers, String organizer_description, String state, String background_image, String code_of_conduct, int id, String logo, String schedule_published_on, String privacy, String name, CreatorModel creator, VersionModel version, String topic, String timezone, String start_time, String end_time, String description, ArrayList<Social_linksModel> social_links, String location_name) {

		this.email = email;
		this.type = type;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.state = state;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.name = name;
		this._creator = creator;
		this._version = version;
		this.topic = topic;
		this.timezone = timezone;
		this.start_time = start_time;
		this.end_time = end_time;
		this.description = description;
		this.social_links = social_links;
		this.location_name = location_name;

	}

}