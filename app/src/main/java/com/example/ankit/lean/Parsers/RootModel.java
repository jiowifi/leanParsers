import java.util.ArrayList;

class RootModel {

	public String state;
	public String type;
	public String end_time;
	public String organizer_description;
	public String name;
	public String background_image;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String description;
	public String organizer_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String email;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public int id;
	public String privacy;
	public String location_name;
	public String topic;
	public CreatorModel _creator;
	public String logo;

	public RootModel(String state, String type, String end_time, String organizer_description, String name, String background_image, String code_of_conduct, ArrayList<Social_linksModel> social_links, String timezone, String description, String organizer_name, String schedule_published_on, CopyrightModel copyright, String email, VersionModel version, Call_for_papersModel call_for_papers, String start_time, int id, String privacy, String location_name, String topic, CreatorModel creator, String logo) {

		this.state = state;
		this.type = type;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.name = name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.timezone = timezone;
		this.description = description;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.email = email;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.id = id;
		this.privacy = privacy;
		this.location_name = location_name;
		this.topic = topic;
		this._creator = creator;
		this.logo = logo;

	}

}