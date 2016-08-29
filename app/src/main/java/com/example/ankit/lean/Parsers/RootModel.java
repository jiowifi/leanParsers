import java.util.ArrayList;

class RootModel {

	public int id;
	public String timezone;
	public String name;
	public String privacy;
	public VersionModel _version;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String end_time;
	public String code_of_conduct;
	public String location_name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String state;
	public String description;
	public String background_image;
	public String type;
	public String organizer_description;
	public String email;

	public RootModel(int id, String timezone, String name, String privacy, VersionModel version, String schedule_published_on, CopyrightModel copyright, CreatorModel creator, String end_time, String code_of_conduct, String location_name, String logo, Call_for_papersModel call_for_papers, String organizer_name, String start_time, ArrayList<Social_linksModel> social_links, String topic, String state, String description, String background_image, String type, String organizer_description, String email) {

		this.id = id;
		this.timezone = timezone;
		this.name = name;
		this.privacy = privacy;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._creator = creator;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.social_links = social_links;
		this.topic = topic;
		this.state = state;
		this.description = description;
		this.background_image = background_image;
		this.type = type;
		this.organizer_description = organizer_description;
		this.email = email;

	}

}