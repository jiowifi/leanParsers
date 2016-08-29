import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String type;
	public String organizer_description;
	public String start_time;
	public String state;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String privacy;
	public String topic;
	public String location_name;
	public String description;
	public String name;
	public String end_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String background_image;
	public int id;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String code_of_conduct;

	public RootModel(String timezone, String type, String organizer_description, String start_time, String state, String logo, Call_for_papersModel call_for_papers, VersionModel version, ArrayList<Social_linksModel> social_links, String email, String privacy, String topic, String location_name, String description, String name, String end_time, String organizer_name, CopyrightModel copyright, String background_image, int id, CreatorModel creator, String schedule_published_on, String code_of_conduct) {

		this.timezone = timezone;
		this.type = type;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.state = state;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.social_links = social_links;
		this.email = email;
		this.privacy = privacy;
		this.topic = topic;
		this.location_name = location_name;
		this.description = description;
		this.name = name;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.background_image = background_image;
		this.id = id;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;

	}

}