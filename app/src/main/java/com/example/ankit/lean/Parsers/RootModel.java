import java.util.ArrayList;

class RootModel {

	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String start_time;
	public CopyrightModel _copyright;
	public int id;
	public String email;
	public String state;
	public VersionModel _version;
	public String organizer_name;
	public String logo;
	public String schedule_published_on;
	public String description;
	public String end_time;
	public String privacy;
	public String organizer_description;
	public String location_name;
	public String background_image;
	public String code_of_conduct;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String name;

	public RootModel(String topic, ArrayList<Social_linksModel> social_links, String timezone, String start_time, CopyrightModel copyright, int id, String email, String state, VersionModel version, String organizer_name, String logo, String schedule_published_on, String description, String end_time, String privacy, String organizer_description, String location_name, String background_image, String code_of_conduct, String type, Call_for_papersModel call_for_papers, CreatorModel creator, String name) {

		this.topic = topic;
		this.social_links = social_links;
		this.timezone = timezone;
		this.start_time = start_time;
		this._copyright = copyright;
		this.id = id;
		this.email = email;
		this.state = state;
		this._version = version;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.name = name;

	}

}