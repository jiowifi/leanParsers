import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String end_time;
	public CreatorModel _creator;
	public int id;
	public String description;
	public String topic;
	public String organizer_name;
	public VersionModel _version;
	public String code_of_conduct;
	public String email;
	public String start_time;
	public String type;
	public String schedule_published_on;
	public String timezone;
	public String logo;
	public String name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public CopyrightModel _copyright;
	public String state;

	public RootModel(String organizer_description, ArrayList<Social_linksModel> social_links, String background_image, String end_time, CreatorModel creator, int id, String description, String topic, String organizer_name, VersionModel version, String code_of_conduct, String email, String start_time, String type, String schedule_published_on, String timezone, String logo, String name, String location_name, Call_for_papersModel call_for_papers, String privacy, CopyrightModel copyright, String state) {

		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.background_image = background_image;
		this.end_time = end_time;
		this._creator = creator;
		this.id = id;
		this.description = description;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.start_time = start_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.logo = logo;
		this.name = name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this._copyright = copyright;
		this.state = state;

	}

}