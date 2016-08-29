import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String start_time;
	public String privacy;
	public String location_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String name;
	public String logo;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String state;
	public String topic;
	public String schedule_published_on;
	public String code_of_conduct;
	public String timezone;
	public String organizer_name;
	public CreatorModel _creator;
	public int id;
	public String end_time;
	public String description;

	public RootModel(String organizer_description, String start_time, String privacy, String location_name, String background_image, ArrayList<Social_linksModel> social_links, String email, String name, String logo, String type, Call_for_papersModel call_for_papers, VersionModel version, CopyrightModel copyright, String state, String topic, String schedule_published_on, String code_of_conduct, String timezone, String organizer_name, CreatorModel creator, int id, String end_time, String description) {

		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.privacy = privacy;
		this.location_name = location_name;
		this.background_image = background_image;
		this.social_links = social_links;
		this.email = email;
		this.name = name;
		this.logo = logo;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this._copyright = copyright;
		this.state = state;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.id = id;
		this.end_time = end_time;
		this.description = description;

	}

}