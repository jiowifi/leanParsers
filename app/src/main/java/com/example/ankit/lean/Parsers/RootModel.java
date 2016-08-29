import java.util.ArrayList;

class RootModel {

	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String location_name;
	public String state;
	public String email;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String privacy;
	public String organizer_description;
	public CopyrightModel _copyright;
	public int id;
	public String type;
	public String background_image;
	public String description;
	public String organizer_name;
	public CreatorModel _creator;
	public String start_time;
	public String name;
	public String schedule_published_on;
	public String logo;
	public String code_of_conduct;

	public RootModel(String timezone, Call_for_papersModel call_for_papers, VersionModel version, String location_name, String state, String email, String end_time, ArrayList<Social_linksModel> social_links, String topic, String privacy, String organizer_description, CopyrightModel copyright, int id, String type, String background_image, String description, String organizer_name, CreatorModel creator, String start_time, String name, String schedule_published_on, String logo, String code_of_conduct) {

		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.location_name = location_name;
		this.state = state;
		this.email = email;
		this.end_time = end_time;
		this.social_links = social_links;
		this.topic = topic;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.id = id;
		this.type = type;
		this.background_image = background_image;
		this.description = description;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.start_time = start_time;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;

	}

}