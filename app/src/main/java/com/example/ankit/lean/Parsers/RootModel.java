import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String logo;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String start_time;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String organizer_description;
	public String type;
	public String code_of_conduct;
	public int id;
	public CreatorModel _creator;
	public String location_name;
	public String end_time;
	public VersionModel _version;
	public String name;
	public String email;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String timezone;
	public String topic;

	public RootModel(String schedule_published_on, String logo, String privacy, ArrayList<Social_linksModel> social_links, String description, String start_time, String background_image, Call_for_papersModel call_for_papers, String state, String organizer_description, String type, String code_of_conduct, int id, CreatorModel creator, String location_name, String end_time, VersionModel version, String name, String email, String organizer_name, CopyrightModel copyright, String timezone, String topic) {

		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.privacy = privacy;
		this.social_links = social_links;
		this.description = description;
		this.start_time = start_time;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.organizer_description = organizer_description;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._creator = creator;
		this.location_name = location_name;
		this.end_time = end_time;
		this._version = version;
		this.name = name;
		this.email = email;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.timezone = timezone;
		this.topic = topic;

	}

}