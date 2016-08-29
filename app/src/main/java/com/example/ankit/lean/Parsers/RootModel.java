import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String start_time;
	public String name;
	public CreatorModel _creator;
	public String topic;
	public String logo;
	public String organizer_description;
	public String end_time;
	public String code_of_conduct;
	public VersionModel _version;
	public String state;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String type;
	public String timezone;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public CopyrightModel _copyright;
	public int id;
	public String description;
	public String schedule_published_on;

	public RootModel(String location_name, String start_time, String name, CreatorModel creator, String topic, String logo, String organizer_description, String end_time, String code_of_conduct, VersionModel version, String state, String privacy, ArrayList<Social_linksModel> social_links, String email, String type, String timezone, String organizer_name, Call_for_papersModel call_for_papers, String background_image, CopyrightModel copyright, int id, String description, String schedule_published_on) {

		this.location_name = location_name;
		this.start_time = start_time;
		this.name = name;
		this._creator = creator;
		this.topic = topic;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.state = state;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this.type = type;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._copyright = copyright;
		this.id = id;
		this.description = description;
		this.schedule_published_on = schedule_published_on;

	}

}