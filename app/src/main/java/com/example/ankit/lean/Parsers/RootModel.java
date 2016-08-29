import java.util.ArrayList;

class RootModel {

	public String logo;
	public int id;
	public String location_name;
	public String state;
	public CreatorModel _creator;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String name;
	public String timezone;
	public VersionModel _version;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public String topic;
	public String background_image;
	public String code_of_conduct;
	public String privacy;
	public String description;
	public String email;
	public String end_time;

	public RootModel(String logo, int id, String location_name, String state, CreatorModel creator, String start_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String name, String timezone, VersionModel version, String organizer_description, Call_for_papersModel call_for_papers, String organizer_name, CopyrightModel copyright, String type, String topic, String background_image, String code_of_conduct, String privacy, String description, String email, String end_time) {

		this.logo = logo;
		this.id = id;
		this.location_name = location_name;
		this.state = state;
		this._creator = creator;
		this.start_time = start_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.timezone = timezone;
		this._version = version;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.topic = topic;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.description = description;
		this.email = email;
		this.end_time = end_time;

	}

}