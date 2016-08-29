import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_name;
	public String privacy;
	public String organizer_description;
	public String type;
	public String start_time;
	public String name;
	public String timezone;
	public String logo;
	public String email;
	public String topic;
	public String code_of_conduct;
	public String schedule_published_on;
	public VersionModel _version;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public CreatorModel _creator;
	public String background_image;
	public String state;
	public String description;

	public RootModel(Call_for_papersModel call_for_papers, CopyrightModel copyright, int id, String organizer_name, String privacy, String organizer_description, String type, String start_time, String name, String timezone, String logo, String email, String topic, String code_of_conduct, String schedule_published_on, VersionModel version, String location_name, ArrayList<Social_linksModel> social_links, String end_time, CreatorModel creator, String background_image, String state, String description) {

		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.id = id;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.type = type;
		this.start_time = start_time;
		this.name = name;
		this.timezone = timezone;
		this.logo = logo;
		this.email = email;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.location_name = location_name;
		this.social_links = social_links;
		this.end_time = end_time;
		this._creator = creator;
		this.background_image = background_image;
		this.state = state;
		this.description = description;

	}

}